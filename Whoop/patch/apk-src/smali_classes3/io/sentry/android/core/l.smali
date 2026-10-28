.class public final Lio/sentry/android/core/l;
.super La30/w0;
.source "SourceFile"

# interfaces
.implements Lio/sentry/android/core/b0;


# direct methods
.method public constructor <init>(Lio/sentry/q6;Lcd3/g;)V
    .locals 0

    invoke-direct {p0, p1, p2}, La30/w0;-><init>(Lio/sentry/q6;Lcd3/g;)V

    sget-object p1, Lio/sentry/android/core/e0;->E:Lio/sentry/android/core/e0;

    invoke-virtual {p1, p0}, Lio/sentry/android/core/e0;->b(Lio/sentry/android/core/b0;)V

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 1

    sget-object v0, Lio/sentry/android/core/e0;->E:Lio/sentry/android/core/e0;

    invoke-virtual {v0, p0}, Lio/sentry/android/core/e0;->k(Lio/sentry/android/core/b0;)V

    invoke-super {p0, p1}, La30/w0;->a(Z)V

    return-void
.end method

.method public final i()V
    .locals 0

    return-void
.end method

.method public final k()V
    .locals 5

    iget-object v0, p0, La30/w0;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/q6;

    :try_start_0
    invoke-virtual {v0}, Lio/sentry/q6;->getExecutorService()Lio/sentry/h1;

    move-result-object v1

    new-instance v2, Lbq/b;

    const/4 v3, 0x6

    invoke-direct {v2, p0, v3}, Lbq/b;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v1, v2}, Lio/sentry/h1;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v2, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "Failed to submit log flush in onBackground()"

    invoke-interface {v0, v2, v1, v4, v3}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
