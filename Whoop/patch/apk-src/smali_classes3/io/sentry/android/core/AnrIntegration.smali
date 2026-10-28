.class public final Lio/sentry/android/core/AnrIntegration;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/t1;
.implements Ljava/io/Closeable;


# static fields
.field public static E:Lio/sentry/android/core/a;

.field public static final F:Lio/sentry/util/a;


# instance fields
.field public final w:Landroid/content/Context;

.field public x:Z

.field public final y:Lio/sentry/util/a;

.field public z:Lio/sentry/q6;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/sentry/util/a;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    sput-object v0, Lio/sentry/android/core/AnrIntegration;->F:Lio/sentry/util/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/sentry/android/core/AnrIntegration;->x:Z

    new-instance v0, Lio/sentry/util/a;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lio/sentry/android/core/AnrIntegration;->y:Lio/sentry/util/a;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    move-object p1, v0

    :cond_0
    iput-object p1, p0, Lio/sentry/android/core/AnrIntegration;->w:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final b(Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 12

    sget-object v0, Lio/sentry/android/core/AnrIntegration;->F:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v1

    :try_start_0
    sget-object v0, Lio/sentry/android/core/AnrIntegration;->E:Lio/sentry/android/core/a;

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v2, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v3, "ANR timeout in milliseconds: %d"

    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->getAnrTimeoutIntervalMillis()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v0, v2, v3, v4}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v5, Lio/sentry/android/core/a;

    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->getAnrTimeoutIntervalMillis()J

    move-result-wide v6

    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isAnrReportInDebug()Z

    move-result v8

    new-instance v9, Lc9/c;

    const/16 v0, 0x10

    invoke-direct {v9, v0, p0, p1}, Lc9/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v10

    iget-object v11, p0, Lio/sentry/android/core/AnrIntegration;->w:Landroid/content/Context;

    invoke-direct/range {v5 .. v11}, Lio/sentry/android/core/a;-><init>(JZLc9/c;Lio/sentry/v0;Landroid/content/Context;)V

    sput-object v5, Lio/sentry/android/core/AnrIntegration;->E:Lio/sentry/android/core/a;

    invoke-virtual {v5}, Ljava/lang/Thread;->start()V

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    const-string v0, "AnrIntegration installed."

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-interface {p1, v2, v0, v3}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {v1}, Lio/sentry/s;->close()V

    return-void

    :goto_1
    :try_start_1
    invoke-virtual {v1}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
.end method

.method public final close()V
    .locals 5

    iget-object v0, p0, Lio/sentry/android/core/AnrIntegration;->y:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lio/sentry/android/core/AnrIntegration;->x:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    invoke-virtual {v0}, Lio/sentry/s;->close()V

    sget-object v0, Lio/sentry/android/core/AnrIntegration;->F:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_1
    sget-object v1, Lio/sentry/android/core/AnrIntegration;->E:Lio/sentry/android/core/a;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    const/4 v1, 0x0

    sput-object v1, Lio/sentry/android/core/AnrIntegration;->E:Lio/sentry/android/core/a;

    iget-object v1, p0, Lio/sentry/android/core/AnrIntegration;->z:Lio/sentry/q6;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v2, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v3, "AnrIntegration removed."

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-interface {v1, v2, v3, v4}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lio/sentry/s;->close()V

    return-void

    :goto_1
    :try_start_2
    invoke-virtual {v0}, Lio/sentry/s;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v1

    :catchall_2
    move-exception v1

    :try_start_3
    invoke-virtual {v0}, Lio/sentry/s;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v1
.end method

.method public final m(Lio/sentry/q6;)V
    .locals 4

    iput-object p1, p0, Lio/sentry/android/core/AnrIntegration;->z:Lio/sentry/q6;

    check-cast p1, Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isAnrEnabled()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "AnrIntegration enabled: %s"

    invoke-interface {v0, v1, v3, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Lio/sentry/android/core/SentryAndroidOptions;->isAnrEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Anr"

    invoke-static {v0}, Ljc/x;->i(Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p1}, Lio/sentry/q6;->getExecutorService()Lio/sentry/h1;

    move-result-object v0

    new-instance v1, La8/c;

    const/16 v2, 0x1c

    invoke-direct {v1, v2, p0, p1}, La8/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Lio/sentry/h1;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v1, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v2, "Failed to start AnrIntegration on executor thread."

    invoke-interface {p1, v1, v2, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method
