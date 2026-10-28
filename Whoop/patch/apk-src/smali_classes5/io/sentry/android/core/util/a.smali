.class public final Lio/sentry/android/core/util/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public volatile b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lad3/z;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lio/sentry/android/core/util/a;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Li5/c;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lio/sentry/android/core/util/a;->b:Ljava/lang/Object;

    .line 3
    iput-object p1, p0, Lio/sentry/android/core/util/a;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Lbl/a;
    .locals 4

    iget-object v0, p0, Lio/sentry/android/core/util/a;->b:Ljava/lang/Object;

    check-cast v0, Lbl/a;

    if-nez v0, :cond_6

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lio/sentry/android/core/util/a;->b:Ljava/lang/Object;

    check-cast v0, Lbl/a;

    if-nez v0, :cond_4

    iget-object v0, p0, Lio/sentry/android/core/util/a;->a:Ljava/lang/Object;

    check-cast v0, Lad3/z;

    iget-object v0, v0, Lad3/z;->x:Ljava/lang/Object;

    check-cast v0, Lbl/d;

    const-string v1, "image_manager_disk_cache"

    iget-object v0, v0, Lbl/d;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move-object v3, v2

    goto :goto_0

    :cond_0
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    :goto_0
    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance v2, Lbl/c;

    invoke-direct {v2, v3}, Lbl/c;-><init>(Ljava/io/File;)V

    :cond_3
    :goto_1
    iput-object v2, p0, Lio/sentry/android/core/util/a;->b:Ljava/lang/Object;

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_4
    :goto_2
    iget-object v0, p0, Lio/sentry/android/core/util/a;->b:Ljava/lang/Object;

    check-cast v0, Lbl/a;

    if-nez v0, :cond_5

    new-instance v0, Lu00/e;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lu00/e;-><init>(I)V

    iput-object v0, p0, Lio/sentry/android/core/util/a;->b:Ljava/lang/Object;

    :cond_5
    monitor-exit p0

    goto :goto_4

    :goto_3
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_6
    :goto_4
    iget-object v0, p0, Lio/sentry/android/core/util/a;->b:Ljava/lang/Object;

    check-cast v0, Lbl/a;

    return-object v0
.end method

.method public b(Landroid/content/Context;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lio/sentry/android/core/util/a;->b:Ljava/lang/Object;

    if-nez v0, :cond_1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lio/sentry/android/core/util/a;->b:Ljava/lang/Object;

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/sentry/android/core/util/a;->a:Ljava/lang/Object;

    check-cast v0, Li5/c;

    invoke-virtual {v0, p1}, Li5/c;->c(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/android/core/util/a;->b:Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    goto :goto_2

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_2
    iget-object p1, p0, Lio/sentry/android/core/util/a;->b:Ljava/lang/Object;

    return-object p1
.end method
