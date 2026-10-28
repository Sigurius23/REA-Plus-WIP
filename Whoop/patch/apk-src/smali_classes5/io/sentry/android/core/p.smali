.class public final synthetic Lio/sentry/android/core/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/util/e;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/sentry/android/core/SentryAndroidOptions;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/SentryAndroidOptions;I)V
    .locals 0

    iput p2, p0, Lio/sentry/android/core/p;->w:I

    iput-object p1, p0, Lio/sentry/android/core/p;->x:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public j()Ljava/lang/Object;
    .locals 7

    iget v0, p0, Lio/sentry/android/core/p;->w:I

    iget-object v1, p0, Lio/sentry/android/core/p;->x:Lio/sentry/android/core/SentryAndroidOptions;

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lio/sentry/android/core/cache/b;->L:Ljava/util/List;

    invoke-virtual {v1}, Lio/sentry/q6;->getOutboxPath()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v3, "Outbox path is null, the startup crash marker file does not exist"

    new-array v4, v2, [Ljava/lang/Object;

    invoke-interface {v0, v1, v3, v4}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v3, Ljava/io/File;

    const-string v4, "startup_crash"

    invoke-direct {v3, v0, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v4

    sget-object v5, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v6, "Failed to delete the startup crash marker file. %s."

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v4, v5, v6, v3}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    move v2, v0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v3, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v4, "Error reading/deleting the startup crash marker file on the disk"

    invoke-interface {v1, v3, v4, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-virtual {v1}, Lio/sentry/q6;->getExecutorService()Lio/sentry/h1;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
