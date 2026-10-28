.class public Lio/sentry/android/core/AnrV2Integration;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/t1;
.implements Ljava/io/Closeable;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "NewApi"
    }
.end annotation


# instance fields
.field public final w:Landroid/content/Context;

.field public final x:Lio/sentry/transport/d;

.field public y:Lio/sentry/android/core/SentryAndroidOptions;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    move-object p1, v0

    :cond_0
    iput-object p1, p0, Lio/sentry/android/core/AnrV2Integration;->w:Landroid/content/Context;

    sget-object p1, Lio/sentry/transport/d;->w:Lio/sentry/transport/d;

    iput-object p1, p0, Lio/sentry/android/core/AnrV2Integration;->x:Lio/sentry/transport/d;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 4

    iget-object v0, p0, Lio/sentry/android/core/AnrV2Integration;->y:Lio/sentry/android/core/SentryAndroidOptions;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "AnrV2Integration removed."

    invoke-interface {v0, v1, v3, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final m(Lio/sentry/q6;)V
    .locals 7

    instance-of v0, p1, Lio/sentry/android/core/SentryAndroidOptions;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/sentry/android/core/SentryAndroidOptions;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "SentryAndroidOptions is required"

    invoke-static {v0, v1}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lio/sentry/android/core/AnrV2Integration;->y:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    iget-object v2, p0, Lio/sentry/android/core/AnrV2Integration;->y:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v2}, Lio/sentry/android/core/SentryAndroidOptions;->isAnrEnabled()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "AnrIntegration enabled: %s"

    invoke-interface {v0, v1, v3, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lio/sentry/android/core/AnrV2Integration;->y:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v0}, Lio/sentry/q6;->getCacheDirPath()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-object p1, p0, Lio/sentry/android/core/AnrV2Integration;->y:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v0, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v2, "Cache dir is not set, unable to process ANRs"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p1, v0, v2, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_1
    iget-object v0, p0, Lio/sentry/android/core/AnrV2Integration;->y:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v0}, Lio/sentry/android/core/SentryAndroidOptions;->isAnrEnabled()Z

    move-result v0

    if-eqz v0, :cond_2

    :try_start_0
    invoke-virtual {p1}, Lio/sentry/q6;->getExecutorService()Lio/sentry/h1;

    move-result-object v0

    new-instance v2, Lio/sentry/android/core/i0;

    iget-object v3, p0, Lio/sentry/android/core/AnrV2Integration;->w:Landroid/content/Context;

    iget-object v4, p0, Lio/sentry/android/core/AnrV2Integration;->y:Lio/sentry/android/core/SentryAndroidOptions;

    iget-object v5, p0, Lio/sentry/android/core/AnrV2Integration;->x:Lio/sentry/transport/d;

    new-instance v6, Lio/sentry/android/core/y;

    invoke-direct {v6, v4}, Lio/sentry/android/core/y;-><init>(Lio/sentry/android/core/SentryAndroidOptions;)V

    invoke-direct {v2, v3, v4, v5, v6}, Lio/sentry/android/core/i0;-><init>(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;Lio/sentry/transport/d;Lio/sentry/android/core/h0;)V

    invoke-interface {v0, v2}, Lio/sentry/h1;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v2

    sget-object v3, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v4, "Failed to start ANR processor."

    invoke-interface {v2, v3, v4, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v0, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v2, "AnrV2Integration installed."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p1, v0, v2, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    const-string p1, "AnrV2"

    invoke-static {p1}, Ljc/x;->i(Ljava/lang/String;)V

    :cond_2
    return-void
.end method
