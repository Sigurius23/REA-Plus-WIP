.class public final Lio/sentry/ShutdownHookIntegration;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/t1;
.implements Ljava/io/Closeable;


# instance fields
.field public final w:Ljava/lang/Runtime;

.field public x:Ljava/lang/Thread;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v1, "Runtime is required"

    invoke-static {v0, v1}, Lpf/c;->S(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lio/sentry/ShutdownHookIntegration;->w:Ljava/lang/Runtime;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    iget-object v0, p0, Lio/sentry/ShutdownHookIntegration;->x:Ljava/lang/Thread;

    if-eqz v0, :cond_1

    new-instance v0, Lio/sentry/c7;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/sentry/c7;-><init>(Ljava/lang/Object;I)V

    :try_start_0
    invoke-virtual {v0}, Lio/sentry/c7;->run()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "Shutdown in progress"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "VM already shutting down"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public final m(Lio/sentry/q6;)V
    .locals 4

    invoke-virtual {p1}, Lio/sentry/q6;->isEnableShutdownHook()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/Thread;

    new-instance v2, Lio/sentry/m4;

    const/4 v3, 0x3

    invoke-direct {v2, p1, v3}, Lio/sentry/m4;-><init>(Lio/sentry/q6;I)V

    const-string v3, "sentry-shutdownhook"

    invoke-direct {v0, v2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    iput-object v0, p0, Lio/sentry/ShutdownHookIntegration;->x:Ljava/lang/Thread;

    :try_start_0
    iget-object v0, p0, Lio/sentry/ShutdownHookIntegration;->w:Ljava/lang/Runtime;

    iget-object v2, p0, Lio/sentry/ShutdownHookIntegration;->x:Ljava/lang/Thread;

    invoke-virtual {v0, v2}, Ljava/lang/Runtime;->addShutdownHook(Ljava/lang/Thread;)V

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v0, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v2, "ShutdownHookIntegration installed."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p1, v0, v2, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    const-string p1, "ShutdownHook"

    invoke-static {p1}, Ljc/x;->i(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "Shutdown in progress"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "VM already shutting down"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return-void

    :cond_1
    throw p1

    :cond_2
    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v0, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v2, "enableShutdownHook is disabled."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p1, v0, v2, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
