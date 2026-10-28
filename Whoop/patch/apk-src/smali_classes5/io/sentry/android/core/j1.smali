.class public final Lio/sentry/android/core/j1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;


# direct methods
.method public static c(Ldt/g;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Ldt/g;->a()V

    iget-object v0, p0, Ldt/g;->c:Ldt/i;

    iget-object v1, v0, Ldt/i;->e:Ljava/lang/String;

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p0}, Ldt/g;->a()V

    iget-object p0, v0, Ldt/i;->b:Ljava/lang/String;

    const-string v0, "1:"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    return-object p0

    :cond_1
    const-string v0, ":"

    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    array-length v0, p0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-ge v0, v1, :cond_2

    return-object v2

    :cond_2
    const/4 v0, 0x1

    aget-object p0, p0, v0

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    return-object v2

    :cond_3
    return-object p0
.end method


# virtual methods
.method public a(J)I
    .locals 7

    iget v0, p0, Lio/sentry/android/core/j1;->a:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lio/sentry/android/core/j1;->c:Ljava/lang/Object;

    check-cast v1, [J

    array-length v2, v1

    const/16 v3, 0xe

    const/4 v4, 0x0

    if-gt v0, v2, :cond_0

    goto :goto_0

    :cond_0
    mul-int/lit8 v2, v2, 0x2

    new-array v0, v2, [J

    new-array v2, v2, [I

    array-length v5, v1

    invoke-static {v1, v0, v4, v4, v5}, Lm83/n;->g0([J[JIII)V

    iget-object v1, p0, Lio/sentry/android/core/j1;->d:Ljava/lang/Object;

    check-cast v1, [I

    invoke-static {v4, v4, v1, v2, v3}, Lm83/n;->j0(II[I[II)V

    iput-object v0, p0, Lio/sentry/android/core/j1;->c:Ljava/lang/Object;

    iput-object v2, p0, Lio/sentry/android/core/j1;->d:Ljava/lang/Object;

    :goto_0
    iget v0, p0, Lio/sentry/android/core/j1;->a:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lio/sentry/android/core/j1;->a:I

    iget-object v1, p0, Lio/sentry/android/core/j1;->e:Ljava/lang/Object;

    check-cast v1, [I

    array-length v1, v1

    iget v2, p0, Lio/sentry/android/core/j1;->b:I

    if-lt v2, v1, :cond_2

    mul-int/lit8 v1, v1, 0x2

    new-array v2, v1, [I

    move v5, v4

    :goto_1
    if-ge v5, v1, :cond_1

    add-int/lit8 v6, v5, 0x1

    aput v6, v2, v5

    move v5, v6

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lio/sentry/android/core/j1;->e:Ljava/lang/Object;

    check-cast v1, [I

    invoke-static {v4, v4, v1, v2, v3}, Lm83/n;->j0(II[I[II)V

    iput-object v2, p0, Lio/sentry/android/core/j1;->e:Ljava/lang/Object;

    :cond_2
    iget v1, p0, Lio/sentry/android/core/j1;->b:I

    iget-object v2, p0, Lio/sentry/android/core/j1;->e:Ljava/lang/Object;

    check-cast v2, [I

    aget v3, v2, v1

    iput v3, p0, Lio/sentry/android/core/j1;->b:I

    iget-object v3, p0, Lio/sentry/android/core/j1;->c:Ljava/lang/Object;

    check-cast v3, [J

    aput-wide p1, v3, v0

    iget-object v4, p0, Lio/sentry/android/core/j1;->d:Ljava/lang/Object;

    check-cast v4, [I

    aput v1, v4, v0

    aput v0, v2, v1

    :goto_2
    if-lez v0, :cond_3

    add-int/lit8 v2, v0, 0x1

    shr-int/lit8 v2, v2, 0x1

    add-int/lit8 v2, v2, -0x1

    aget-wide v4, v3, v2

    invoke-static {v4, v5, p1, p2}, Lkotlin/jvm/internal/k;->l(JJ)I

    move-result v4

    if-lez v4, :cond_3

    invoke-virtual {p0, v2, v0}, Lio/sentry/android/core/j1;->g(II)V

    move v0, v2

    goto :goto_2

    :cond_3
    return v1
.end method

.method public declared-synchronized b()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lio/sentry/android/core/j1;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lio/sentry/android/core/j1;->f()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lio/sentry/android/core/j1;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public d(Ljava/lang/String;)Landroid/content/pm/PackageInfo;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lio/sentry/android/core/j1;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Failed to find package "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "FirebaseMessaging"

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x0

    return-object p1
.end method

.method public e()Z
    .locals 4

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lio/sentry/android/core/j1;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    monitor-exit p0

    goto :goto_1

    :cond_0
    :try_start_1
    iget-object v0, p0, Lio/sentry/android/core/j1;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v2, "com.google.android.c2dm.permission.SEND"

    const-string v3, "com.google.android.gms"

    invoke-virtual {v0, v2, v3}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_1

    const-string v0, "FirebaseMessaging"

    const-string v2, "Google Play services missing or without correct permission."

    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    move v0, v1

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    :try_start_2
    new-instance v2, Landroid/content/Intent;

    const-string v3, "com.google.iid.TOKEN_REQUEST"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v3, "com.google.android.gms"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v0, v2, v1}, Landroid/content/pm/PackageManager;->queryBroadcastReceivers(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v0

    const/4 v2, 0x2

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    iput v2, p0, Lio/sentry/android/core/j1;->b:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    :goto_0
    move v0, v2

    goto :goto_1

    :cond_2
    :try_start_3
    const-string v0, "FirebaseMessaging"

    const-string v3, "Failed to resolve IID implementation package, falling back"

    invoke-static {v0, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iput v2, p0, Lio/sentry/android/core/j1;->b:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    goto :goto_0

    :goto_1
    if-eqz v0, :cond_3

    const/4 v0, 0x1

    return v0

    :cond_3
    return v1

    :goto_2
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0
.end method

.method public declared-synchronized f()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lio/sentry/android/core/j1;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/sentry/android/core/j1;->d(Ljava/lang/String;)Landroid/content/pm/PackageInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    iget v1, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lio/sentry/android/core/j1;->d:Ljava/lang/Object;

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    iput-object v0, p0, Lio/sentry/android/core/j1;->e:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public g(II)V
    .locals 7

    iget-object v0, p0, Lio/sentry/android/core/j1;->c:Ljava/lang/Object;

    check-cast v0, [J

    iget-object v1, p0, Lio/sentry/android/core/j1;->d:Ljava/lang/Object;

    check-cast v1, [I

    iget-object v2, p0, Lio/sentry/android/core/j1;->e:Ljava/lang/Object;

    check-cast v2, [I

    aget-wide v3, v0, p1

    aget-wide v5, v0, p2

    aput-wide v5, v0, p1

    aput-wide v3, v0, p2

    aget v0, v1, p1

    aget v3, v1, p2

    aput v3, v1, p1

    aput v0, v1, p2

    aput p1, v2, v3

    aput p2, v2, v0

    return-void
.end method
