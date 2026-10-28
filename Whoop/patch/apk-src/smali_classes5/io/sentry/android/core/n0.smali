.class public final Lio/sentry/android/core/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile i:Lio/sentry/android/core/n0;

.field public static final j:Lio/sentry/util/a;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lio/sentry/android/core/SentryAndroidOptions;

.field public final c:Lio/sentry/android/core/k0;

.field public final d:Ljava/lang/Boolean;

.field public final e:Lbd3/u;

.field public final f:Lbd3/k;

.field public final g:Lio/sentry/protocol/p;

.field public final h:Ljava/lang/Long;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/sentry/util/a;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    sput-object v0, Lio/sentry/android/core/n0;->j:Lio/sentry/util/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/core/n0;->a:Landroid/content/Context;

    iput-object p2, p0, Lio/sentry/android/core/n0;->b:Lio/sentry/android/core/SentryAndroidOptions;

    new-instance v0, Lio/sentry/android/core/k0;

    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/sentry/android/core/k0;-><init>(Lio/sentry/v0;)V

    iput-object v0, p0, Lio/sentry/android/core/n0;->c:Lio/sentry/android/core/k0;

    sget-object v0, Lio/sentry/android/core/internal/util/f;->c:Lio/sentry/android/core/internal/util/f;

    invoke-virtual {v0}, Lio/sentry/android/core/internal/util/f;->a()Ljava/util/ArrayList;

    new-instance v0, Lio/sentry/protocol/p;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-string v1, "Android"

    iput-object v1, v0, Lio/sentry/protocol/p;->w:Ljava/lang/String;

    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    iput-object v1, v0, Lio/sentry/protocol/p;->x:Ljava/lang/String;

    sget-object v1, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    iput-object v1, v0, Lio/sentry/protocol/p;->z:Ljava/lang/String;

    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    const-string v2, "os.version"

    invoke-static {v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/io/File;

    const-string v4, "/proc/version"

    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->canRead()Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_2

    :cond_0
    :try_start_0
    new-instance v4, Ljava/io/BufferedReader;

    new-instance v5, Ljava/io/FileReader;

    invoke-direct {v5, v3}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V

    invoke-direct {v4, v5}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-virtual {v4}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v4}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    move-object v2, v3

    goto :goto_2

    :catch_0
    move-exception v3

    goto :goto_1

    :catchall_0
    move-exception v3

    :try_start_3
    invoke-virtual {v4}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v4

    :try_start_4
    invoke-virtual {v3, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v3
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :goto_1
    sget-object v4, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v5, "Exception while attempting to read kernel information"

    invoke-interface {v1, v4, v5, v3}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    if-eqz v2, :cond_1

    iput-object v2, v0, Lio/sentry/protocol/p;->E:Ljava/lang/String;

    :cond_1
    invoke-virtual {p2}, Lio/sentry/android/core/SentryAndroidOptions;->isEnableRootCheck()Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Lio/sentry/android/core/internal/util/j;

    iget-object v2, p0, Lio/sentry/android/core/n0;->a:Landroid/content/Context;

    iget-object v3, p0, Lio/sentry/android/core/n0;->c:Lio/sentry/android/core/k0;

    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v4

    invoke-direct {v1, v2, v4, v3}, Lio/sentry/android/core/internal/util/j;-><init>(Landroid/content/Context;Lio/sentry/v0;Lio/sentry/android/core/k0;)V

    invoke-virtual {v1}, Lio/sentry/android/core/internal/util/j;->a()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/protocol/p;->F:Ljava/lang/Boolean;

    :cond_2
    iput-object v0, p0, Lio/sentry/android/core/n0;->g:Lio/sentry/protocol/p;

    iget-object v0, p0, Lio/sentry/android/core/n0;->c:Lio/sentry/android/core/k0;

    invoke-virtual {v0}, Lio/sentry/android/core/k0;->a()Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/android/core/n0;->d:Ljava/lang/Boolean;

    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    iget-object v1, p0, Lio/sentry/android/core/n0;->c:Lio/sentry/android/core/k0;

    const/4 v2, 0x0

    const/4 v3, 0x0

    :try_start_5
    invoke-static {p1, v1}, Lio/sentry/android/core/j0;->f(Landroid/content/Context;Lio/sentry/android/core/k0;)Landroid/content/pm/PackageInfo;

    move-result-object v1

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    if-eqz v1, :cond_4

    if-eqz v4, :cond_4

    iget-object v1, v1, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;
    :try_end_5
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5 .. :try_end_5} :catch_1

    :try_start_6
    invoke-virtual {v4, v1}, Landroid/content/pm/PackageManager;->getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lbd3/u;

    if-nez v4, :cond_3

    const/4 v6, 0x1

    goto :goto_3

    :cond_3
    move v6, v2

    :goto_3
    invoke-direct {v5, v6, v4}, Lbd3/u;-><init>(ZLjava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/IllegalArgumentException; {:try_start_6 .. :try_end_6} :catch_2

    goto :goto_4

    :catch_1
    move-object v1, v3

    :catch_2
    sget-object v4, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v5, "%s package isn\'t installed."

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v4, v5, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_4
    move-object v5, v3

    :goto_4
    iput-object v5, p0, Lio/sentry/android/core/n0;->e:Lbd3/u;

    iget-object v0, p0, Lio/sentry/android/core/n0;->c:Lio/sentry/android/core/k0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x21

    if-lt v1, v4, :cond_5

    sget-object v1, Lio/sentry/android/core/j0;->d:Lio/sentry/android/core/util/a;

    invoke-virtual {v1, p1}, Lio/sentry/android/core/util/a;->b(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/ApplicationInfo;

    goto :goto_5

    :cond_5
    sget-object v1, Lio/sentry/android/core/j0;->e:Lio/sentry/android/core/util/a;

    invoke-virtual {v1, p1}, Lio/sentry/android/core/util/a;->b(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/ApplicationInfo;

    :goto_5
    invoke-static {p1, v0}, Lio/sentry/android/core/j0;->f(Landroid/content/Context;Lio/sentry/android/core/k0;)Landroid/content/pm/PackageInfo;

    move-result-object v0

    if-eqz v0, :cond_7

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->splitNames:[Ljava/lang/String;

    if-eqz v1, :cond_6

    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    if-eqz v1, :cond_6

    const-string v2, "com.android.vending.splits.required"

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    :cond_6
    new-instance v1, Lbd3/k;

    invoke-direct {v1, v2, v0}, Lbd3/k;-><init>(Z[Ljava/lang/String;)V

    goto :goto_6

    :cond_7
    move-object v1, v3

    :goto_6
    iput-object v1, p0, Lio/sentry/android/core/n0;->f:Lbd3/k;

    invoke-virtual {p2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    invoke-static {p1, p2}, Lio/sentry/android/core/j0;->d(Landroid/content/Context;Lio/sentry/v0;)Landroid/app/ActivityManager$MemoryInfo;

    move-result-object p1

    if-eqz p1, :cond_8

    iget-wide p1, p1, Landroid/app/ActivityManager$MemoryInfo;->totalMem:J

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/android/core/n0;->h:Ljava/lang/Long;

    goto :goto_7

    :cond_8
    iput-object v3, p0, Lio/sentry/android/core/n0;->h:Ljava/lang/Long;

    :goto_7
    return-void
.end method

.method public static b(Landroid/content/Intent;Lio/sentry/q6;)Ljava/lang/Float;
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "level"

    const/4 v2, -0x1

    invoke-virtual {p0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    const-string v3, "scale"

    invoke-virtual {p0, v3, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p0

    if-eq v1, v2, :cond_1

    if-ne p0, v2, :cond_0

    goto :goto_0

    :cond_0
    int-to-float v1, v1

    int-to-float p0, p0

    div-float/2addr v1, p0

    const/high16 p0, 0x42c80000    # 100.0f

    mul-float/2addr v1, p0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_1
    :goto_0
    return-object v0

    :goto_1
    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v2, "Error getting device battery level."

    invoke-interface {p1, v1, v2, p0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;)Lio/sentry/android/core/n0;
    .locals 3

    sget-object v0, Lio/sentry/android/core/n0;->i:Lio/sentry/android/core/n0;

    if-nez v0, :cond_2

    sget-object v0, Lio/sentry/android/core/n0;->j:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_0
    sget-object v1, Lio/sentry/android/core/n0;->i:Lio/sentry/android/core/n0;

    if-nez v1, :cond_1

    new-instance v1, Lio/sentry/android/core/n0;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    if-eqz v2, :cond_0

    move-object p0, v2

    :cond_0
    invoke-direct {v1, p0, p1}, Lio/sentry/android/core/n0;-><init>(Landroid/content/Context;Lio/sentry/android/core/SentryAndroidOptions;)V

    sput-object v1, Lio/sentry/android/core/n0;->i:Lio/sentry/android/core/n0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {v0}, Lio/sentry/s;->close()V

    goto :goto_3

    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/s;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p0

    :cond_2
    :goto_3
    sget-object p0, Lio/sentry/android/core/n0;->i:Lio/sentry/android/core/n0;

    return-object p0
.end method

.method public static d(Landroid/content/Intent;Lio/sentry/q6;)Ljava/lang/Boolean;
    .locals 2

    :try_start_0
    const-string v0, "plugged"

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v1, 0x2

    if-ne p0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v0, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v1, "Error getting device charging state."

    invoke-interface {p1, v0, v1, p0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final a(ZZ)Lio/sentry/protocol/f;
    .locals 14

    iget-object v1, p0, Lio/sentry/android/core/n0;->a:Landroid/content/Context;

    new-instance v7, Lio/sentry/protocol/f;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    iput-object v0, v7, Lio/sentry/protocol/f;->x:Ljava/lang/String;

    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    iput-object v0, v7, Lio/sentry/protocol/f;->y:Ljava/lang/String;

    iget-object v8, p0, Lio/sentry/android/core/n0;->b:Lio/sentry/android/core/SentryAndroidOptions;

    invoke-virtual {v8}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    invoke-static {v0}, Lio/sentry/android/core/j0;->c(Lio/sentry/v0;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v7, Lio/sentry/protocol/f;->z:Ljava/lang/String;

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    iput-object v0, v7, Lio/sentry/protocol/f;->E:Ljava/lang/String;

    sget-object v0, Landroid/os/Build;->ID:Ljava/lang/String;

    iput-object v0, v7, Lio/sentry/protocol/f;->F:Ljava/lang/String;

    sget-object v0, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    iput-object v0, v7, Lio/sentry/protocol/f;->G:[Ljava/lang/String;

    iget-object v0, p0, Lio/sentry/android/core/n0;->c:Lio/sentry/android/core/k0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1f

    if-lt v0, v2, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Landroid/os/Build;->SOC_MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Landroid/os/Build;->SOC_MODEL:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v7, Lio/sentry/protocol/f;->h0:Ljava/lang/String;

    :cond_0
    const/4 v9, 0x2

    const/4 v10, 0x1

    const/4 v2, 0x0

    const/4 v11, 0x0

    move-object v3, v2

    :try_start_0
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    if-eq v0, v10, :cond_2

    if-eq v0, v9, :cond_1

    move-object v4, v3

    goto :goto_1

    :cond_1
    sget-object v0, Lio/sentry/protocol/e;->LANDSCAPE:Lio/sentry/protocol/e;

    :goto_0
    move-object v4, v0

    goto :goto_1

    :cond_2
    sget-object v0, Lio/sentry/protocol/e;->PORTRAIT:Lio/sentry/protocol/e;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    goto :goto_0

    :goto_1
    if-nez v4, :cond_3

    :try_start_1
    invoke-virtual {v8}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v5, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v6, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)"

    new-array v12, v11, [Ljava/lang/Object;

    invoke-interface {v0, v5, v6, v12}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v4, v2

    goto :goto_4

    :catchall_0
    move-exception v0

    goto :goto_3

    :goto_2
    move-object v4, v2

    goto :goto_3

    :catchall_1
    move-exception v0

    goto :goto_2

    :goto_3
    invoke-virtual {v8}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v5

    sget-object v6, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v12, "Error getting device orientation."

    invoke-interface {v5, v6, v12, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    :goto_4
    iput-object v4, v7, Lio/sentry/protocol/f;->K:Lio/sentry/protocol/e;

    iget-object v0, p0, Lio/sentry/android/core/n0;->d:Ljava/lang/Boolean;

    if-eqz v0, :cond_4

    iput-object v0, v7, Lio/sentry/protocol/f;->L:Ljava/lang/Boolean;

    :cond_4
    invoke-virtual {v8}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v4

    :try_start_2
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_5

    :catchall_2
    move-exception v0

    sget-object v5, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v6, "Error getting DisplayMetrics."

    invoke-interface {v4, v5, v6, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v3

    :goto_5
    if-eqz v0, :cond_5

    iget v4, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v7, Lio/sentry/protocol/f;->U:Ljava/lang/Integer;

    iget v4, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v7, Lio/sentry/protocol/f;->V:Ljava/lang/Integer;

    iget v4, v0, Landroid/util/DisplayMetrics;->density:F

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    iput-object v4, v7, Lio/sentry/protocol/f;->W:Ljava/lang/Float;

    iget v0, v0, Landroid/util/DisplayMetrics;->densityDpi:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v7, Lio/sentry/protocol/f;->X:Ljava/lang/Integer;

    :cond_5
    :try_start_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v12

    sub-long/2addr v4, v12

    invoke-static {v4, v5}, Ljc/x;->P(J)Ljava/util/Date;

    move-result-object v0
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_6

    :catch_0
    move-exception v0

    invoke-virtual {v8}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v4

    sget-object v5, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v6, "Error getting the device\'s boot time."

    new-array v12, v11, [Ljava/lang/Object;

    invoke-interface {v4, v5, v0, v6, v12}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    move-object v0, v2

    :goto_6
    iput-object v0, v7, Lio/sentry/protocol/f;->Y:Ljava/util/Date;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Configuration;->getLocales()Landroid/os/LocaleList;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/LocaleList;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_6

    invoke-virtual {v0, v11}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Calendar;->getInstance(Ljava/util/Locale;)Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeZone()Ljava/util/TimeZone;

    move-result-object v0

    goto :goto_7

    :cond_6
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeZone()Ljava/util/TimeZone;

    move-result-object v0

    :goto_7
    iput-object v0, v7, Lio/sentry/protocol/f;->Z:Ljava/util/TimeZone;

    iget-object v0, v7, Lio/sentry/protocol/f;->a0:Ljava/lang/String;

    if-nez v0, :cond_7

    :try_start_4
    invoke-static {v1}, Lio/sentry/android/core/t0;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_8

    :catchall_3
    move-exception v0

    invoke-virtual {v8}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v4

    sget-object v5, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v6, "Error getting installationId."

    invoke-interface {v4, v5, v6, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v2

    :goto_8
    iput-object v0, v7, Lio/sentry/protocol/f;->a0:Ljava/lang/String;

    :cond_7
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    iget-object v4, v7, Lio/sentry/protocol/f;->b0:Ljava/lang/String;

    if-nez v4, :cond_8

    invoke-virtual {v0}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v7, Lio/sentry/protocol/f;->b0:Ljava/lang/String;

    :cond_8
    sget-object v0, Lio/sentry/android/core/internal/util/f;->c:Lio/sentry/android/core/internal/util/f;

    invoke-virtual {v0}, Lio/sentry/android/core/internal/util/f;->a()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_9

    invoke-static {v0}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    iput-object v4, v7, Lio/sentry/protocol/f;->f0:Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v7, Lio/sentry/protocol/f;->e0:Ljava/lang/Integer;

    :cond_9
    iget-object v0, p0, Lio/sentry/android/core/n0;->h:Ljava/lang/Long;

    iput-object v0, v7, Lio/sentry/protocol/f;->M:Ljava/lang/Long;

    if-eqz p1, :cond_19

    invoke-virtual {v8}, Lio/sentry/android/core/SentryAndroidOptions;->isCollectAdditionalContext()Z

    move-result p1

    if-eqz p1, :cond_19

    invoke-virtual {v8}, Lio/sentry/android/core/SentryAndroidOptions;->isCollectExternalStorageContext()Z

    move-result p1

    move-object v4, v3

    new-instance v3, Landroid/content/IntentFilter;

    const-string v0, "android.intent.action.BATTERY_CHANGED"

    invoke-direct {v3, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x21

    if-lt v0, v5, :cond_a

    const/4 v4, 0x0

    const/4 v6, 0x4

    move-object v5, v2

    invoke-virtual/range {v1 .. v6}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;I)Landroid/content/Intent;

    move-result-object v0

    goto :goto_9

    :cond_a
    invoke-virtual {v1, v2, v3, v4, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    move-result-object v0

    :goto_9
    if-eqz v0, :cond_c

    invoke-static {v0, v8}, Lio/sentry/android/core/n0;->b(Landroid/content/Intent;Lio/sentry/q6;)Ljava/lang/Float;

    move-result-object v3

    iput-object v3, v7, Lio/sentry/protocol/f;->H:Ljava/lang/Float;

    invoke-static {v0, v8}, Lio/sentry/android/core/n0;->d(Landroid/content/Intent;Lio/sentry/q6;)Ljava/lang/Boolean;

    move-result-object v3

    iput-object v3, v7, Lio/sentry/protocol/f;->I:Ljava/lang/Boolean;

    :try_start_5
    const-string v3, "temperature"

    const/4 v4, -0x1

    invoke-virtual {v0, v3, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    if-eq v0, v4, :cond_b

    int-to-float v0, v0

    const/high16 v3, 0x41200000    # 10.0f

    div-float/2addr v0, v3

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    goto :goto_a

    :catchall_4
    move-exception v0

    invoke-virtual {v8}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v3

    sget-object v4, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v5, "Error getting battery temperature."

    invoke-interface {v3, v4, v5, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_b
    move-object v0, v2

    :goto_a
    iput-object v0, v7, Lio/sentry/protocol/f;->d0:Ljava/lang/Float;

    :cond_c
    sget-object v0, Lio/sentry/android/core/m0;->a:[I

    invoke-virtual {v8}, Lio/sentry/q6;->getConnectionStatusProvider()Lio/sentry/p0;

    move-result-object v3

    invoke-interface {v3}, Lio/sentry/p0;->l()Lio/sentry/n0;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v0, v0, v3

    if-eq v0, v10, :cond_e

    if-eq v0, v9, :cond_d

    move-object v0, v2

    goto :goto_b

    :cond_d
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_b

    :cond_e
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_b
    iput-object v0, v7, Lio/sentry/protocol/f;->J:Ljava/lang/Boolean;

    invoke-virtual {v8}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    invoke-static {v1, v0}, Lio/sentry/android/core/j0;->d(Landroid/content/Context;Lio/sentry/v0;)Landroid/app/ActivityManager$MemoryInfo;

    move-result-object v0

    if-eqz v0, :cond_f

    if-eqz p2, :cond_f

    iget-wide v3, v0, Landroid/app/ActivityManager$MemoryInfo;->availMem:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iput-object v3, v7, Lio/sentry/protocol/f;->N:Ljava/lang/Long;

    iget-boolean v0, v0, Landroid/app/ActivityManager$MemoryInfo;->lowMemory:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, v7, Lio/sentry/protocol/f;->P:Ljava/lang/Boolean;

    :cond_f
    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_10

    new-instance v3, Landroid/os/StatFs;

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    :try_start_6
    invoke-virtual {v3}, Landroid/os/StatFs;->getBlockSizeLong()J

    move-result-wide v4

    invoke-virtual {v3}, Landroid/os/StatFs;->getBlockCountLong()J

    move-result-wide v9

    mul-long/2addr v9, v4

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    goto :goto_c

    :catchall_5
    move-exception v0

    invoke-virtual {v8}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v4

    sget-object v5, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v6, "Error getting total internal storage amount."

    invoke-interface {v4, v5, v6, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v2

    :goto_c
    iput-object v0, v7, Lio/sentry/protocol/f;->Q:Ljava/lang/Long;

    :try_start_7
    invoke-virtual {v3}, Landroid/os/StatFs;->getBlockSizeLong()J

    move-result-wide v4

    invoke-virtual {v3}, Landroid/os/StatFs;->getAvailableBlocksLong()J

    move-result-wide v9

    mul-long/2addr v9, v4

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    goto :goto_d

    :catchall_6
    move-exception v0

    invoke-virtual {v8}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v3

    sget-object v4, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v5, "Error getting unused internal storage amount."

    invoke-interface {v3, v4, v5, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v2

    :goto_d
    iput-object v0, v7, Lio/sentry/protocol/f;->R:Ljava/lang/Long;

    :cond_10
    if-eqz p1, :cond_18

    invoke-virtual {v1, v2}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    :try_start_8
    invoke-virtual {v1, v2}, Landroid/content/Context;->getExternalFilesDirs(Ljava/lang/String;)[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_14

    if-eqz p1, :cond_11

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    goto :goto_e

    :cond_11
    move-object p1, v2

    :goto_e
    array-length v1, v0

    move v3, v11

    :goto_f
    if-ge v3, v1, :cond_15

    aget-object v4, v0, v3

    if-nez v4, :cond_12

    goto :goto_10

    :cond_12
    if-eqz p1, :cond_16

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_13

    goto :goto_11

    :cond_13
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_16

    :goto_10
    add-int/lit8 v3, v3, 0x1

    goto :goto_f

    :cond_14
    invoke-virtual {v8}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v0, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v1, "Not possible to read getExternalFilesDirs"

    new-array v3, v11, [Ljava/lang/Object;

    invoke-interface {p1, v0, v1, v3}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_15
    move-object v4, v2

    :cond_16
    :goto_11
    if-eqz v4, :cond_17

    new-instance p1, Landroid/os/StatFs;

    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    goto :goto_12

    :catchall_7
    invoke-virtual {v8}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v0, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v1, "Not possible to read external files directory"

    new-array v3, v11, [Ljava/lang/Object;

    invoke-interface {p1, v0, v1, v3}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_17
    move-object p1, v2

    :goto_12
    if-eqz p1, :cond_18

    :try_start_9
    invoke-virtual {p1}, Landroid/os/StatFs;->getBlockSizeLong()J

    move-result-wide v0

    invoke-virtual {p1}, Landroid/os/StatFs;->getBlockCountLong()J

    move-result-wide v3

    mul-long/2addr v3, v0

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    goto :goto_13

    :catchall_8
    move-exception v0

    invoke-virtual {v8}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v3, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v4, "Error getting total external storage amount."

    invoke-interface {v1, v3, v4, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v0, v2

    :goto_13
    iput-object v0, v7, Lio/sentry/protocol/f;->S:Ljava/lang/Long;

    :try_start_a
    invoke-virtual {p1}, Landroid/os/StatFs;->getBlockSizeLong()J

    move-result-wide v0

    invoke-virtual {p1}, Landroid/os/StatFs;->getAvailableBlocksLong()J

    move-result-wide v3

    mul-long/2addr v3, v0

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_9

    goto :goto_14

    :catchall_9
    move-exception v0

    move-object p1, v0

    invoke-virtual {v8}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v3, "Error getting unused external storage amount."

    invoke-interface {v0, v1, v3, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_14
    iput-object v2, v7, Lio/sentry/protocol/f;->T:Ljava/lang/Long;

    :cond_18
    iget-object p1, v7, Lio/sentry/protocol/f;->c0:Ljava/lang/String;

    if-nez p1, :cond_19

    invoke-virtual {v8}, Lio/sentry/q6;->getConnectionStatusProvider()Lio/sentry/p0;

    move-result-object p1

    invoke-interface {p1}, Lio/sentry/p0;->G()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v7, Lio/sentry/protocol/f;->c0:Ljava/lang/String;

    :cond_19
    return-object v7
.end method
