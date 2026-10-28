.class public final Lio/sentry/cache/f;
.super Lio/sentry/f4;
.source "SourceFile"


# static fields
.field public static final c:Ljava/nio/charset/Charset;


# instance fields
.field public final a:Lio/sentry/q6;

.field public final b:Lio/sentry/util/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lio/sentry/cache/f;->c:Ljava/nio/charset/Charset;

    return-void
.end method

.method public constructor <init>(Lio/sentry/q6;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/sentry/util/f;

    new-instance v1, Lcom/whoop/data/repositories/c;

    const/16 v2, 0xc

    invoke-direct {v1, p0, v2}, Lcom/whoop/data/repositories/c;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v0, v1}, Lio/sentry/util/f;-><init>(Lio/sentry/util/e;)V

    iput-object v0, p0, Lio/sentry/cache/f;->b:Lio/sentry/util/f;

    iput-object p1, p0, Lio/sentry/cache/f;->a:Lio/sentry/q6;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/cache/f;->a:Lio/sentry/q6;

    const-string v1, ".scope-cache"

    invoke-static {v0, v1, p1}, Lio/sentry/cache/a;->a(Lio/sentry/q6;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final d(Lio/sentry/q6;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1

    const-string v0, "breadcrumbs.json"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object p2, p0, Lio/sentry/cache/f;->b:Lio/sentry/util/f;

    invoke-virtual {p2}, Lio/sentry/util/f;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/sentry/cache/tape/f;

    invoke-virtual {p2}, Lio/sentry/cache/tape/f;->F0()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object p2, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const/4 p3, 0x0

    new-array p3, p3, [Ljava/lang/Object;

    const-string v0, "Unable to read serialized breadcrumbs from QueueFile"

    invoke-interface {p1, p2, v0, p3}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    const-string v0, ".scope-cache"

    invoke-static {p1, v0, p2, p3}, Lio/sentry/cache/a;->c(Lio/sentry/q6;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final e(Lio/sentry/protocol/h0;)V
    .locals 2

    new-instance v0, Landroidx/lifecycle/m;

    const/16 v1, 0x11

    invoke-direct {v0, v1, p0, p1}, Landroidx/lifecycle/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lio/sentry/cache/f;->f(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final f(Ljava/lang/Runnable;)V
    .locals 4

    iget-object v0, p0, Lio/sentry/cache/f;->a:Lio/sentry/q6;

    invoke-virtual {v0}, Lio/sentry/q6;->isEnableScopePersistence()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "SentryExecutor"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    :try_start_0
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v2, "Serialization task failed"

    invoke-interface {v0, v1, v2, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/q6;->getExecutorService()Lio/sentry/h1;

    move-result-object v1

    new-instance v2, Landroidx/lifecycle/m;

    const/16 v3, 0x16

    invoke-direct {v2, v3, p0, p1}, Landroidx/lifecycle/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Lio/sentry/h1;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    return-void

    :catchall_1
    move-exception p1

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v2, "Serialization task could not be scheduled"

    invoke-interface {v0, v1, v2, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final g(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/cache/f;->a:Lio/sentry/q6;

    const-string v1, ".scope-cache"

    invoke-static {v0, p1, v1, p2}, Lio/sentry/cache/a;->d(Lio/sentry/q6;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final h(Lio/sentry/e;)V
    .locals 2

    new-instance v0, Landroidx/lifecycle/m;

    const/16 v1, 0x13

    invoke-direct {v0, v1, p0, p1}, Landroidx/lifecycle/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lio/sentry/cache/f;->f(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final i(Ljava/util/Collection;)V
    .locals 1

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Landroidx/lifecycle/z0;

    const/16 v0, 0xc

    invoke-direct {p1, p0, v0}, Landroidx/lifecycle/z0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p0, p1}, Lio/sentry/cache/f;->f(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public final j(Lio/sentry/e7;Lio/sentry/c4;)V
    .locals 2

    new-instance v0, Lh6/l;

    const/4 v1, 0x3

    invoke-direct {v0, p0, p1, p2, v1}, Lh6/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p0, v0}, Lio/sentry/cache/f;->f(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final k(Lio/sentry/protocol/c;)V
    .locals 2

    new-instance v0, Landroidx/lifecycle/m;

    const/16 v1, 0x14

    invoke-direct {v0, v1, p0, p1}, Landroidx/lifecycle/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lio/sentry/cache/f;->f(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final m(Ljava/util/concurrent/ConcurrentHashMap;)V
    .locals 2

    new-instance v0, Landroidx/lifecycle/m;

    const/16 v1, 0x12

    invoke-direct {v0, v1, p0, p1}, Landroidx/lifecycle/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lio/sentry/cache/f;->f(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final n(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Landroidx/lifecycle/m;

    const/16 v1, 0x15

    invoke-direct {v0, v1, p0, p1}, Landroidx/lifecycle/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lio/sentry/cache/f;->f(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final t(Lio/sentry/protocol/v;)V
    .locals 2

    new-instance v0, Lio/sentry/android/core/r0;

    const/4 v1, 0x6

    invoke-direct {v0, v1, p0, p1}, Lio/sentry/android/core/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lio/sentry/cache/f;->f(Ljava/lang/Runnable;)V

    return-void
.end method
