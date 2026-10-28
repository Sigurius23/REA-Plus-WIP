.class public final Lu93/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lub/g;
.implements Lul/a;


# instance fields
.field public final w:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    const-string v0, "com.google.android.gms.appid"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lu93/d0;->w:Ljava/lang/Object;

    .line 4
    const-string v1, "com.google.android.gms.appid-no-backup"

    .line 5
    invoke-static {p1}, Ls4/c;->getNoBackupFilesDir(Landroid/content/Context;)Ljava/io/File;

    move-result-object p1

    .line 6
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 7
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    .line 8
    :cond_0
    :try_start_0
    invoke-virtual {v2}, Ljava/io/File;->createNewFile()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 9
    monitor-enter p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    :try_start_1
    invoke-interface {v0}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    monitor-exit p0

    if-nez p1, :cond_1

    .line 11
    const-string p1, "FirebaseMessaging"

    const-string v1, "App restored, clearing state"

    invoke-static {p1, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    monitor-enter p0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 13
    :try_start_3
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 14
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    return-void

    :catchall_0
    move-exception p1

    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    throw p1
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_0

    :catch_0
    move-exception p1

    goto :goto_0

    :catchall_1
    move-exception p1

    .line 15
    :try_start_7
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :try_start_8
    throw p1
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_0

    .line 16
    :goto_0
    const-string v0, "FirebaseMessaging"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 17
    const-string v0, "FirebaseMessaging"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Error creating file in no backup dir: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_1
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu93/d0;->w:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lwd3/g;)V
    .locals 8

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 20
    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 21
    new-instance v6, Ljava/util/concurrent/SynchronousQueue;

    invoke-direct {v6}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    const/4 v1, 0x0

    const v2, 0x7fffffff

    const-wide/16 v3, 0x3c

    move-object v7, p1

    .line 22
    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    iput-object v0, p0, Lu93/d0;->w:Ljava/lang/Object;

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    const-string v0, "|T|"

    const-string v1, "|*"

    invoke-static {p0, v0, p1, v1}, Ldc/b;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public b()I
    .locals 1

    iget-object v0, p0, Lu93/d0;->w:Ljava/lang/Object;

    check-cast v0, Lwb/e;

    iget-object v0, v0, Lwb/e;->z:[I

    array-length v0, v0

    return v0
.end method

.method public create()Ljava/lang/Object;
    .locals 3

    new-instance v0, Lzk/i;

    iget-object v1, p0, Lu93/d0;->w:Ljava/lang/Object;

    check-cast v1, Lae3/k;

    iget-object v2, v1, Lae3/k;->c:Ljava/lang/Object;

    check-cast v2, Lio/sentry/android/core/util/a;

    iget-object v1, v1, Lae3/k;->d:Ljava/lang/Object;

    check-cast v1, Ls/m2;

    invoke-direct {v0, v2, v1}, Lzk/i;-><init>(Lio/sentry/android/core/util/a;Ls/m2;)V

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lu93/d0;->w:Ljava/lang/Object;

    check-cast v0, Lwb/e;

    iget-object v0, v0, Lwb/f;->x:Ljava/lang/String;

    return-object v0
.end method

.method public i(Lub/f;)V
    .locals 6

    iget-object v0, p0, Lu93/d0;->w:Ljava/lang/Object;

    check-cast v0, Lwb/e;

    iget-object v1, v0, Lwb/e;->z:[I

    array-length v1, v1

    const/4 v2, 0x1

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_5

    iget-object v4, v0, Lwb/e;->z:[I

    aget v4, v4, v3

    if-eq v4, v2, :cond_4

    const/4 v5, 0x2

    if-eq v4, v5, :cond_3

    const/4 v5, 0x3

    if-eq v4, v5, :cond_2

    const/4 v5, 0x4

    if-eq v4, v5, :cond_1

    const/4 v5, 0x5

    if-eq v4, v5, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p1, v3}, Lub/f;->u(I)V

    goto :goto_1

    :cond_1
    iget-object v4, v0, Lwb/e;->H:[[B

    aget-object v4, v4, v3

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {p1, v3, v4}, Lub/f;->q(I[B)V

    goto :goto_1

    :cond_2
    iget-object v4, v0, Lwb/e;->G:[Ljava/lang/String;

    aget-object v4, v4, v3

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {p1, v3, v4}, Lub/f;->n0(ILjava/lang/String;)V

    goto :goto_1

    :cond_3
    iget-object v4, v0, Lwb/e;->F:[D

    aget-wide v4, v4, v3

    invoke-interface {p1, v4, v5, v3}, Lub/f;->t(DI)V

    goto :goto_1

    :cond_4
    iget-object v4, v0, Lwb/e;->E:[J

    aget-wide v4, v4, v3

    invoke-interface {p1, v3, v4, v5}, Lub/f;->p(IJ)V

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    return-void
.end method
