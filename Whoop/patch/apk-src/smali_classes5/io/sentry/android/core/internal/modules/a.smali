.class public final Lio/sentry/android/core/internal/modules/a;
.super Lio/sentry/internal/modules/d;
.source "SourceFile"


# instance fields
.field public final e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/sentry/q6;)V
    .locals 2

    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    invoke-direct {p0, v0}, Lio/sentry/internal/modules/d;-><init>(Lio/sentry/v0;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    move-object p1, v0

    :cond_0
    iput-object p1, p0, Lio/sentry/android/core/internal/modules/a;->e:Landroid/content/Context;

    :try_start_0
    invoke-virtual {p2}, Lio/sentry/q6;->getExecutorService()Lio/sentry/h1;

    move-result-object p1

    new-instance v0, Landroidx/lifecycle/z0;

    const/16 v1, 0xb

    invoke-direct {v0, p0, v1}, Landroidx/lifecycle/z0;-><init>(Ljava/lang/Object;I)V

    invoke-interface {p1, v0}, Lio/sentry/h1;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object v0, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v1, "AssetsModulesLoader submit failed"

    invoke-interface {p2, v0, v1, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final b()Ljava/util/Map;
    .locals 5

    iget-object v0, p0, Lio/sentry/internal/modules/d;->a:Lio/sentry/v0;

    const-string v1, "sentry-external-modules.txt"

    new-instance v2, Ljava/util/TreeMap;

    invoke-direct {v2}, Ljava/util/TreeMap;-><init>()V

    :try_start_0
    iget-object v3, p0, Lio/sentry/android/core/internal/modules/a;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v3
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-virtual {p0, v3}, Lio/sentry/internal/modules/d;->c(Ljava/io/InputStream;)Ljava/util/TreeMap;

    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v3, :cond_0

    :try_start_2
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    return-object v4

    :catch_0
    move-exception v1

    goto :goto_1

    :cond_0
    return-object v4

    :catchall_0
    move-exception v4

    if-eqz v3, :cond_1

    :try_start_3
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v3

    :try_start_4
    invoke-virtual {v4, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    throw v4
    :try_end_4
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :goto_1
    sget-object v3, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v4, "Error extracting modules."

    invoke-interface {v0, v3, v4, v1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :catch_1
    sget-object v3, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v4, "%s file was not found."

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v3, v4, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_2
    return-object v2
.end method
