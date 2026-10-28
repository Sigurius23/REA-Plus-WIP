.class public abstract Lio/sentry/android/core/j0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lio/sentry/android/core/util/a;

.field public static final b:Lio/sentry/android/core/util/a;

.field public static final c:Lio/sentry/android/core/util/a;

.field public static final d:Lio/sentry/android/core/util/a;

.field public static final e:Lio/sentry/android/core/util/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/sentry/android/core/util/a;

    new-instance v1, Li5/c;

    const/16 v2, 0x11

    invoke-direct {v1, v2}, Li5/c;-><init>(I)V

    invoke-direct {v0, v1}, Lio/sentry/android/core/util/a;-><init>(Li5/c;)V

    sput-object v0, Lio/sentry/android/core/j0;->a:Lio/sentry/android/core/util/a;

    new-instance v0, Lio/sentry/android/core/util/a;

    new-instance v1, Li5/c;

    const/16 v2, 0x12

    invoke-direct {v1, v2}, Li5/c;-><init>(I)V

    invoke-direct {v0, v1}, Lio/sentry/android/core/util/a;-><init>(Li5/c;)V

    sput-object v0, Lio/sentry/android/core/j0;->b:Lio/sentry/android/core/util/a;

    new-instance v0, Lio/sentry/android/core/util/a;

    new-instance v1, Li5/c;

    const/16 v2, 0x13

    invoke-direct {v1, v2}, Li5/c;-><init>(I)V

    invoke-direct {v0, v1}, Lio/sentry/android/core/util/a;-><init>(Li5/c;)V

    sput-object v0, Lio/sentry/android/core/j0;->c:Lio/sentry/android/core/util/a;

    new-instance v0, Lio/sentry/android/core/util/a;

    new-instance v1, Li5/c;

    const/16 v2, 0x14

    invoke-direct {v1, v2}, Li5/c;-><init>(I)V

    invoke-direct {v0, v1}, Lio/sentry/android/core/util/a;-><init>(Li5/c;)V

    sput-object v0, Lio/sentry/android/core/j0;->d:Lio/sentry/android/core/util/a;

    new-instance v0, Lio/sentry/android/core/util/a;

    new-instance v1, Li5/c;

    const/16 v2, 0x15

    invoke-direct {v1, v2}, Li5/c;-><init>(I)V

    invoke-direct {v0, v1}, Lio/sentry/android/core/util/a;-><init>(Li5/c;)V

    sput-object v0, Lio/sentry/android/core/j0;->e:Lio/sentry/android/core/util/a;

    return-void
.end method

.method public static synthetic a(Landroid/content/Context;)Landroid/content/pm/ApplicationInfo;
    .locals 3

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const-wide/16 v1, 0x80

    invoke-static {v1, v2}, Landroid/content/pm/PackageManager$ApplicationInfoFlags;->of(J)Landroid/content/pm/PackageManager$ApplicationInfoFlags;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;Landroid/content/pm/PackageManager$ApplicationInfoFlags;)Landroid/content/pm/ApplicationInfo;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic b(Landroid/content/Context;)Landroid/content/pm/PackageInfo;
    .locals 3

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Landroid/content/pm/PackageManager$PackageInfoFlags;->of(J)Landroid/content/pm/PackageManager$PackageInfoFlags;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;Landroid/content/pm/PackageManager$PackageInfoFlags;)Landroid/content/pm/PackageInfo;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static c(Lio/sentry/v0;)Ljava/lang/String;
    .locals 3

    :try_start_0
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v1, " "

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aget-object p0, v0, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception v0

    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v2, "Error getting device family."

    invoke-interface {p0, v1, v2, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static d(Landroid/content/Context;Lio/sentry/v0;)Landroid/app/ActivityManager$MemoryInfo;
    .locals 3

    const-string v0, "Error getting MemoryInfo."

    const/4 v1, 0x0

    :try_start_0
    const-string v2, "activity"

    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/ActivityManager;

    new-instance v2, Landroid/app/ActivityManager$MemoryInfo;

    invoke-direct {v2}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V

    if-eqz p0, :cond_0

    invoke-virtual {p0, v2}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V

    return-object v2

    :catchall_0
    move-exception p0

    goto :goto_0

    :cond_0
    sget-object p0, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {p1, p0, v0, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v1

    :goto_0
    sget-object v2, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-interface {p1, v2, v0, p0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v1
.end method

.method public static e(Landroid/content/Context;Lio/sentry/v0;Lio/sentry/android/core/k0;)Landroid/content/pm/PackageInfo;
    .locals 2

    :try_start_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x21

    const/16 v1, 0x1000

    if-lt p2, v0, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p2

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    int-to-long v0, v1

    invoke-static {v0, v1}, Landroid/content/pm/PackageManager$PackageInfoFlags;->of(J)Landroid/content/pm/PackageManager$PackageInfoFlags;

    move-result-object v0

    invoke-virtual {p2, p0, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;Landroid/content/pm/PackageManager$PackageInfoFlags;)Landroid/content/pm/PackageInfo;

    move-result-object p0

    return-object p0

    :catchall_0
    move-exception p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p2

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :goto_0
    sget-object p2, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v0, "Error getting package info."

    invoke-interface {p1, p2, v0, p0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static f(Landroid/content/Context;Lio/sentry/android/core/k0;)Landroid/content/pm/PackageInfo;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x21

    if-lt p1, v0, :cond_0

    sget-object p1, Lio/sentry/android/core/j0;->a:Lio/sentry/android/core/util/a;

    invoke-virtual {p1, p0}, Lio/sentry/android/core/util/a;->b(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/pm/PackageInfo;

    return-object p0

    :cond_0
    sget-object p1, Lio/sentry/android/core/j0;->b:Lio/sentry/android/core/util/a;

    invoke-virtual {p1, p0}, Lio/sentry/android/core/util/a;->b(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/pm/PackageInfo;

    return-object p0
.end method

.method public static g()Z
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Landroid/app/ActivityManager$RunningAppProcessInfo;

    invoke-direct {v1}, Landroid/app/ActivityManager$RunningAppProcessInfo;-><init>()V

    invoke-static {v1}, Landroid/app/ActivityManager;->getMyMemoryState(Landroid/app/ActivityManager$RunningAppProcessInfo;)V

    iget v1, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v2, 0x64

    if-ne v1, v2, :cond_0

    const/4 v0, 0x1

    :catchall_0
    :cond_0
    return v0
.end method
